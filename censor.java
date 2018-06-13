import java.util.Scanner;

public class censor {
  public static void main(String[] args) {
    //waits for input until user enters empty line
    //censors this this format:
    //Name: ...
    //Email: ...
    //Phone: ...
    
    String passage = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the phrase you would like to censor infromation from: ");

    while (true) {
      String temp = scanner.nextLine();

      if(!passage.isEmpty() && temp.isEmpty()) {
        break;
      } else if (passage.isEmpty() && temp.isEmpty()) {
        continue;
      }

      passage += temp;
      passage += '\n';
    }

    System.out.println("Uncensored: ");
    System.out.println(passage);

    String output = "";				//each new line of censored passage
    String small;   					//substring of passage
    String changer = "";			//censored substring
    String line = "";					//line of info user enters
    String[] array = passage.split("\n");

    for(int j = 0; j < array.length; j++){
      line = array[j];
      if(line.contains("Name:")){
        output = line.substring(line.indexOf(':') + 3,line.length() - 1);
        for(int i = 0; i < output.length(); i++){
          if(output.charAt(i) == ' ')
          changer += ' ';
          else
          changer += '*';
        }
      } else if(line.contains("Phone")){
        output = line.substring(line.indexOf(':') + 2,line.length() - 4);
        for(int i = 0; i < output.length(); i++){
          if(output.charAt(i) == '-')
          changer += '-';
          else
          changer += '*';
        }
      }	else if(line.contains("Email")){
        output = line.substring(line.indexOf(':') + 3,line.length());
        for(int i = 0; i < output.length(); i++){
          if(output.charAt(i) == '@'){
            changer += '@';
            changer += output.charAt(i + 1);
            i += 1;
          } else if(output.charAt(i) == '.'){
            changer += output.charAt(i);
            for(int k = i + 1; k < output.length(); k++){
              changer += output.charAt(k);
            }
            break;
          }	else{
            changer += '*';
          }
        }
      }

      array[j] = line.replace(output,changer);
      line = "";
      changer = "";
    }

    passage = "";

    for(int k = 0; k < array.length; k++){
      passage += array[k];
      if (k == array.length - 1)
      break;
      passage += "\n";
    }

    // Print the censored passage
    System.out.println("Censored: ");
    System.out.println(passage);
  }
}
