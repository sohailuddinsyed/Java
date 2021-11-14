package com.javapractice.Basics;

public class ExceptionHandling {
    public static void main(String args[]) {
        int i = 0, j = 1;

        try {
            int k = i / j;

            if (k == 0) throw new AbcException("Answer is 0 :error");
        }

//        } catch (Exception e) {
//
//            System.err.println("Error: " + e);
//        }
        catch (AbcException e) {

            System.err.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Inside finally");
        }
    }
}
