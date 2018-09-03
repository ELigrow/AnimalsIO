package edu.wctc.eligrow;

import java.io.*;
import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PrintWriter outStream = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;
        ArrayList<Talkable> zoo = new ArrayList<>();
        int ans = 0;
        do{
            System.out.println("Enter 1 to add a student\nEnter 2 to add a cat\nEnter 3 to add a dog\nEnter 4 to quit:");
            try {
                ans = AnimalsIO.tryAns(userInput.readLine());
            }catch (InputMismatchException e){
                System.out.println("This is not a valid input.");
            }catch (NumberFormatException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
            if(ans == 1){
                String name = "";
                int age = 0;
                System.out.print("Enter a name for the student: ");
                try {
                    name = userInput.readLine();
                } catch (InputMismatchException e){
                    System.out.print("This is not a proper input");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("Enter the student's age: ");
                try {
                    int i = AnimalsIO.tryAge(userInput.readLine());
                    age = i;
                }
                catch (InputMismatchException e){
                    System.out.print("This is not a proper input");
                    }
                catch (NumberFormatException e){
                    e.printStackTrace();
                    }
                catch (IOException e){
                    e.printStackTrace();
                }
                    zoo.add(new Student(age, name));
            }else if (ans == 2){
                String name = "";
                int mice = 0;
                System.out.print("Enter a name for the cat: ");
                try {
                    name = userInput.readLine();
                } catch (InputMismatchException e){
                    System.out.print("This is not a proper input");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("Enter the number of mice the cat has killed: ");
                try {
                    mice = AnimalsIO.tryMiceKilled(userInput.readLine());
                }
                catch (InputMismatchException e){
                    System.out.print("This is not a proper input");
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                zoo.add(new Cat(mice, name));
            }else if (ans == 3){
                String name = "";
                boolean isFriendly = false;
                System.out.print("Enter a name for the dog: ");
                try {
                    name = userInput.readLine();
                } catch (InputMismatchException e){
                    System.out.print("This is not a proper input");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("True or False: This dog is friendly: ");
                try {
                    isFriendly = AnimalsIO.tryIsFriendly(userInput.readLine());
                }
                catch (InputMismatchException e){
                    System.out.print("This is not a proper input");
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                zoo.add(new Dog(isFriendly, name));
            }else if (ans == 4){
                System.out.println("Goodbye.");
            }else{
                System.out.print("This is not a proper input.");
            }
            counter++;
        }while (ans != 4);

        for (Talkable thing: zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }
}
