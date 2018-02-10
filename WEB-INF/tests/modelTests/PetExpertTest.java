package modelTests;

import com.example.model.PetExpert;

import java.util.List;
import java.util.Map;

import static modelTests.AssertEquals.assertEquals;
/**
 * Created by parsecer on 01.10.2017.
 */
public class PetExpertTest {
            public static void main(String[] args) throws NullPointerException  {
                        testGetPets();
                        testGetPetImgs();
            }

            public static void testGetPets()  {
                        PetExpert petExp=new PetExpert();
                        List<String> pets = petExp.getPets("black");
                        if (assertEquals(pets.get(0), "monkey"))  {
                                 System.out.println("testGetPets() passed");
                        }
                        else  {
                                 System.out.println("testGetPets() failed");
                }
            }

            public static void testGetPetImgs()  throws NullPointerException {
                    PetExpert petExp= new PetExpert();

                    List<String> pets = petExp.getPets("black");
                    Map petImgs = petExp.getPetImgs(pets);

                    String expected= "imgs/" + pets.get(0) + ".jpg";
                    if (assertEquals((String) petImgs.get(pets.get(0)), expected ))  {
                            System.out.println("testGetPetImgs() passed");
                    }
                    else  {
                            System.out.println("testGetPetImgs() failed; expected: " + expected + ", actual: " +
                                    petImgs.get
                                    (pets.get(0)));
                    }
            }
}
