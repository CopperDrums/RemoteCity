package com.example.model;

import java.util.*;

public class PetExpert {
    private List<String> allPets;
    private List<String> greenPets;
    private List<String> yellowPets;

    private Map<String, String> petImgs;

    public PetExpert() {
        setupPets();
        setupImgs();
    }

    private void setupImgs()  {
            petImgs=new HashMap();
            for (int i=0; i<allPets.size(); i++)  {
                    petImgs.put(allPets.get(i), "imgs/" + allPets.get(i) + ".jpg");
            }

            for (int i=0; i<greenPets.size(); i++)  {
                    petImgs.put(greenPets.get(i), "imgs/" + greenPets.get(i) + ".jpg");
            }

            for (int i=0; i<yellowPets.size(); i++)  {
                    petImgs.put(yellowPets.get(i), "imgs/" + yellowPets.get(i) + ".jpg");
            }
    }

    private void setupPets()  {
        allPets = new ArrayList();
        greenPets = new ArrayList();
        yellowPets = new ArrayList();

        yellowPets.add("stag");
        yellowPets.add("giraffe");
        yellowPets.add("lion");
        yellowPets.add("fox");
        yellowPets.add("duck");

        greenPets.add("green_turtle");
        greenPets.add("green_dino");
        greenPets.add("green_snake");

        allPets.add("elephant");
        allPets.add("monkey");
        allPets.add("owl");
        allPets.add("snail");
        allPets.add("parrot");
        allPets.add("kangaroo");
    }

    public Map<String, String> getPetImgs(List<String> pets)  {
            Map<String, String> resultMap = new HashMap();

            String tempPet;
            for (int i=0; i<pets.size(); i++)  {
                    tempPet = pets.get(i);
                    resultMap.put(tempPet, petImgs.get(tempPet));
            }

            return resultMap;
    }

    public List getPets(String color) {
        List<String> pets = new ArrayList();
        Collections.shuffle(allPets);
        Collections.shuffle(yellowPets);
        Collections.shuffle(greenPets);

        if (color.equals("green")) {
            pets.add(greenPets.get(0));
        }

        else if (color.equals("yellow"))  {
            pets.add(yellowPets.get(0));
        }

        else {
            pets.add(allPets.get(0));
        }

        pets.add(allPets.get(1));

        return pets;
    }
}