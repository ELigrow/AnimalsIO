package edu.wctc.eligrow;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Checks non-string methods to ensure they can properly casted.
 * @author eplig
 * @version 1.0
 */

public class AnimalsIO {

    /**
     * Tests conversion of user input
     *
     * @param s String: User input to validate
     * @return Converted Integer
     * @throws InputMismatchException
     */
    public static int tryMiceKilled(String s) throws InputMismatchException {
        int i = 0;
        try {
            i = Integer.parseInt(s);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     * Tests conversion of user input
     *
     * @param s String: User input to validate
     * @return Converted Integer
     * @throws InputMismatchException
     */
    public static int tryAge(String s) throws InputMismatchException, NumberFormatException {
        int i = 0;
        try {
            i = Integer.parseInt(s);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("This is an invalid input.");
        }
        return i;
    }

    /**
     * Tests conversion of user input
     *
     * @param s String: User input to validate
     * @return Converted Integer
     * @throws InputMismatchException
     */
    public static boolean tryIsFriendly(String s) throws InputMismatchException, NumberFormatException{
        boolean b = false;
        try {
            b = Boolean.parseBoolean(s);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            System.out.println("This is an invalid input.");
        }
        return b;
    }

    public static int tryAns(String s) throws InputMismatchException, NumberFormatException {
        int i = 0;
        try {
            i = Integer.parseInt(s);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            System.out.println("This is an invalid input.");
        }
        return i;
    }
}
