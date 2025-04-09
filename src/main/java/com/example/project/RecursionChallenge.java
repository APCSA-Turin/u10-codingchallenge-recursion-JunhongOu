    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n == 1){
                return 2;
                }
                return bunnyEars(n - 1) + 2;
            }
        
            public static int factorial(int n){
                if (n < 2){
                    return 1;
                }
                return factorial(n - 1) * n;
            }

            public static int sumNumbers(int n){
                if (n == 1){
                    return 1;
                }
                return sumNumbers(n - 1) + n;
            }

            public static String countDown(int n){
                if (n == 0){
                    return "Blast Off!";
                }
                return countDown(n - 1) + n;
            }

            public static int power(int x, int n){
                if (n == 0){
                    return 1;
                }
                return power(x, n - 1) * x;
            }

            public static int fib(int n){
                if (n == 0){
                    return 0;
                }
                if (n == 1){
                    return 1;
                }
                return fib(n - 1) + fib(n - 2);
                
            }

            public static int countX(String s){
                if (s.length() == 0){
                    return 0;
                }
                if (s.substring(0, 1).equals("x")){
                    return countX(s.substring(1)) + 1;
                }
                return countX(s.substring(1));
            }

            public static String changePi(String s){
                if (s.length() == 0){
                    return "";
                }
                if (s.length() >= 2 && s.substring(0, 2).equals("pi")){
                    return "3.14" + changePi(s.substring(2));
                }
                return s.substring(0, 1) + changePi(s.substring(1));
            }


            public static String reverse(String s){
                if (s.length() <= 1){
                    return s;
                }
                return reverse(s.substring(1)) + s.charAt(0);
            }

            public static Boolean isPalindrome(String s){
                if (s.length() <= 1){
                    return true;
                }
                if (s.charAt(0) != s.charAt(s.length() - 1)){
                    return false;
                }
                return isPalindrome(s.substring(1, s.length() - 1));
            }

    }