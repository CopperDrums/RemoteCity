/**
 * Created by parsecer on 23.07.2017.
 */
public class Hello {
            public static void main(String[] args)  {
                        System.out.println("HELLO");

                        int[] array = {1,2,3,4,5,7,10};
                        System.out.println(largestNumber(array, 3));
            }

            public static int largestNumber(int[] numbers, int indexMax)  {
                            int result = 0;
                            int previousMax = 0;
                            for (int i=1; i<=indexMax; i++)  {
                                    for (int k=0; k<numbers.length; k++)  {
                                              if (i==1 && numbers[k]>result)  {
                                                        result=numbers[k];
                                                }
                                                else if (i>1 && numbers[k]>result && numbers[k]<previousMax)  {
                                                        result=numbers[k];
                                              }
                                    }
                                    previousMax = result;
                                    result =0;
                            }
                            return previousMax;
            }

            public static String seeker(String substring, String[] words)  {
                        for (String word: words)  {
                                if (word.contains(substring))  {
                                        return word;
                            }
                        }

                        return null;
            }
}


/*
public class Swapper  {
            private String a;
            private String b;

            public Swapper(String s1, String s2)  {
                    a=s1;
                    b=s2;
            }

            public String getA()  {return a;}

            public String getB() {return b;}

            public static void main(String[] args)  {
                        Swapper example = new Swapper("Big", "Dog");

                        System.out.println("a: " + example.getA());  //gives Big
                        System.out.println("b: " + example.getB());  //gives Dog

                        swap(example.getA(), example.getB());

                        System.out.println("a: " + example.getA());  //gives Dog
                        System.out.println("b: " + example.getB());  //gives Big
            }

}*/