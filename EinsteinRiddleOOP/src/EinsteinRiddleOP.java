import java.sql.SQLOutput;
import java.util.Set;

public class EinsteinRiddleOP {
    public static void main(String[] args) {
    /*
    1. The British man lives in the red house.
2. The Swedish man keeps dogs as pets.
3. The Danish man drinks tea.
4. The German plays soccer.
5. The green house’s owner drinks coffee.
6. The owner who plays baseball has birds.
7. The owner who plays basketball lives next to the one who keeps cats.
8. The Norwegian lives in the first house.
9. The owner who plays the violin drinks beer.
10. The owner of the yellow house plays the piano.
11. The owner living in the center house drinks milk.
12. The owner who keeps the horse lives next to the one who plays the piano.
13. The green house is on the immediate left of the white house.
14. The Norwegian lives next to the blue house.
15. The owner who plays basketball lives next to the one who drinks water.
     */


        int N = 5;
        Maison[] maisons = new Maison[N];
        for (int i = 0; i < N; i++) {
            maisons[i] = new Maison();  // 5 maisons vides avec toutes les possibilites
        }
        maisons[0].reduireNumero("un");
        maisons[1].reduireNumero("deux");
        maisons[2].reduireNumero("trois");
        maisons[3].reduireNumero("quatre");
        maisons[4].reduireNumero("cinq");

        for (int counter = 0; counter < N; counter++) {
            for (int counter2 = 0; counter2 < N; counter2++) {
                if (counter != counter2) {
                    if (counter == 0) {
                        maisons[counter2].enleverLoisir("un");
                    } else if (counter == 1) {
                        maisons[counter2].enleverLoisir("deux");
                    } else if (counter == 2) {
                        maisons[counter2].enleverLoisir("trois");
                    } else if (counter == 3) {
                        maisons[counter2].enleverLoisir("quatre");
                    } else if (counter == 4) {
                        maisons[counter2].enleverLoisir("cinq");
                    }
                }
            }
        }

        for (int iii = 0; iii < 7; iii++) {
            int index = -1;

            System.out.println("1. The British man lives in the red house.");
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].nationalites.size() == 1) {
                    if (maisons[counter].containsNationalite("Anglais")) {
                        maisons[counter].reduireCouleur("rouge");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverNationalite("Anglais");
                        maisons[counter].enleverCouleur("rouge");
                    }
                } else if (maisons[counter].couleurs.size() == 1) {
                    if (maisons[counter].containsCouleur("rouge")) {
                        maisons[counter].reduireNationalite("Anglais");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverNationalite("Anglais");
                        maisons[counter].enleverCouleur("rouge");
                    }

                }
            }
            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverNationalite("Anglais");
                        maisons[counter].enleverCouleur("rouge");
                    }
                }
            }

            index = -1;

            System.out.println("2. The Swedish man keeps dogs as pets.");
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].nationalites.size() == 1) {
                    if (maisons[counter].containsNationalite("Suedois")) {
                        maisons[counter].reduireAnimal("chien");
                        index = counter;

                        break;
                    } else {
                        maisons[counter].enleverNationalite("Suedois");
                        maisons[counter].enleverAnimal("chien");
                    }

                } else if (maisons[counter].animaux.size() == 1) {
                    if (maisons[counter].containsAnimal("chien")) {
                        maisons[counter].reduireNationalite("Suedois");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverNationalite("Suedois");
                        maisons[counter].enleverAnimal("chien");
                    }

                }
            }
            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverNationalite("Suedois");
                        maisons[counter].enleverAnimal("chien");
                    }
                }
            }

            index = -1;
            System.out.println("3. The Danish man drinks tea.");
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].nationalites.size() == 1) {
                    if (maisons[counter].containsNationalite("Danois")) {
                        maisons[counter].reduireBoisson("the");
                        index = counter;
                        break;
                    } else {
                        // une autre nationalite occupe la 1
                        maisons[counter].enleverNationalite("Danois");
                        maisons[counter].enleverBoisson("the");


                    }
                } else if (maisons[counter].boissons.size() == 1) {
                    if (maisons[counter].containsBoisson("the")) {
                        maisons[counter].reduireNationalite("Danois");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverNationalite("Danois");
                        maisons[counter].enleverBoisson("the");
                    }

                }
            }
            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverNationalite("Danois");
                        maisons[counter].enleverBoisson("the");
                    }
                }
            }

            index = -1;

            System.out.println("4. The German plays soccer");
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].nationalites.size() == 1) {
                    if (maisons[counter].containsNationalite("Allemand")) {
                        maisons[counter].reduireLoisir("football");
                        index = counter;
                        break;
                    } else {
                        // une autre nationalite occupe la 1
                        maisons[counter].enleverNationalite("Allemand");
                        maisons[counter].enleverLoisir("football");


                    }
                } else if (maisons[counter].loisirs.size() == 1) {
                    if (maisons[counter].containsLoisir("football")) {
                        maisons[counter].reduireNationalite("Allemand");
                        index = counter;

                        break;
                    } else {
                        maisons[counter].enleverNationalite("Allemand");
                        maisons[counter].enleverLoisir("football");
                    }


                }
            }
            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverNationalite("Allemand");
                        maisons[counter].enleverLoisir("football");
                    }
                }
            }


            index = -1;

            System.out.println("5. The green house’s owner drinks coffee.");
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].couleurs.size() == 1) {
                    if (maisons[counter].containsCouleur("vert")) {
                        maisons[counter].reduireBoisson("cafe");
                        index = counter;

                        break;
                    } else {
                        // une autre nationalite occupe la 1
                        maisons[counter].enleverCouleur("vert");
                        maisons[counter].enleverBoisson("cafe");
                    }
                } else if (maisons[counter].boissons.size() == 1) {
                    if (maisons[counter].containsBoisson("cafe")) {
                        maisons[counter].reduireCouleur("vert");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverCouleur("vert");
                        maisons[counter].enleverBoisson("cafe");
                    }
                }
            }

            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverCouleur("vert");
                        maisons[counter].enleverBoisson("cafe");
                    }
                }
            }


            index = -1;
            System.out.println("6. The owner who plays baseball has birds.");
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].loisirs.size() == 1) {
                    if (maisons[counter].containsLoisir("baseball")) {
                        maisons[counter].reduireAnimal("oiseau");
                        index = counter;
                        break;
                    } else {
                        // une autre nationalite occupe la 1
                        maisons[counter].enleverLoisir("baseball");
                        maisons[counter].enleverAnimal("oiseau");
                    }
                } else if (maisons[counter].animaux.size() == 1) {
                    if (maisons[counter].containsAnimal("oiseau")) {
                        maisons[counter].reduireLoisir("baseball");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverLoisir("baseball");
                        maisons[counter].enleverAnimal("oiseau");
                    }

                }
            }
            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverLoisir("baseball");
                        maisons[counter].enleverAnimal("oiseau");
                    }
                }
            }
            System.out.println("7. The owner who plays basketball lives next to the one who keeps cats.");
            index = -1;
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].loisirs.size() == 1) {
                    if (maisons[counter].containsLoisir("basketball")) {
                        maisons[counter].enleverAnimal("chat");
                        break;
                    }
                }
            }

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].animaux.size() == 1) {
                    if (maisons[counter].containsAnimal("chat")) {
                        maisons[counter].enleverLoisir("basketball");
                        break;
                    }
                }
            }


            int num = 0;
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].animaux.size() == 1 && maisons[counter].animaux.contains("chat")) {
                    if (maisons[counter].numero.size() == 1) {
                        Set<String> tmp = maisons[counter].getNumero();
                        System.out.println(tmp);
                        if (tmp.contains("un")) {
                            num = 1;
                        } else if (tmp.contains("deux")) {
                            num = 2;
                        } else if (tmp.contains("trois")) {
                            num = 3;
                        } else if (tmp.contains("quatre")) {
                            num = 4;
                        } else if (tmp.contains("cinq")) {
                            num = 5;
                        }
                        maisons[num - 1].enleverLoisir("basketball");
                        int neighbourNumberL = num - 1;
                        int neighbourNumberR = num + 1;
                        for (int counter2 = neighbourNumberR; counter2 < 5; counter2++) {
                            maisons[counter2].enleverLoisir("basketball");
                        }
                        System.out.println("neighb");
                        System.out.println(neighbourNumberL);
                        System.out.println(neighbourNumberR);
                        if (neighbourNumberL == 0) {
                            maisons[neighbourNumberR - 1].reduireLoisir("basketball");
                        }

                        for (int counter2 = 0; counter2 < neighbourNumberL; counter2++) {
                            maisons[counter2].enleverLoisir("basketball");
                            ;
                        }
                    }
                }
            }

             num = 0;
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].loisirs.size() == 1 && maisons[counter].loisirs.contains("basketball")) {
                    if (maisons[counter].numero.size() == 1) {
                        Set<String> tmp = maisons[counter].getNumero();
                        System.out.println(tmp);
                        if (tmp.contains("un")) {
                            num = 1;
                        } else if (tmp.contains("deux")) {
                            num = 2;
                        } else if (tmp.contains("trois")) {
                            num = 3;
                        } else if (tmp.contains("quatre")) {
                            num = 4;
                        } else if (tmp.contains("cinq")) {
                            num = 5;
                        }
                        maisons[num - 1].enleverAnimal("chat");
                        int neighbourNumberL = num - 1;
                        int neighbourNumberR = num + 1;
                        for (int counter2 = neighbourNumberR; counter2 < 5; counter2++) {
                            maisons[counter2].enleverAnimal("chat");
                        }
                        System.out.println();
                        if (neighbourNumberL == 0) {
                            maisons[neighbourNumberR - 1].reduireAnimal("chat");
                        }

                        for (int counter2 = 0; counter2 < neighbourNumberL-1; counter2++) {
                            maisons[counter2].enleverAnimal("chat");
                            ;
                        }
                    }
                }
            }




            System.out.println("8. The Norwegian lives in the first house.");

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].numero.size() == 1) {
                    if (maisons[counter].containsNumero("un")) {
                        maisons[counter].reduireNationalite("Norvegien");
                        index = counter;

                        break;
                    } else {
                        // une autre nationalite occupe la 1
                        maisons[counter].enleverNumero("un");
                        maisons[counter].enleverNationalite("Norvegien");
                        System.out.println(counter);
                    }
                } else if (maisons[counter].nationalites.size() == 1) {
                    if (maisons[counter].containsNationalite("Norvegien")) {
                        maisons[counter].reduireNumero("un");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverNumero("un");
                        maisons[counter].enleverNationalite("Norvegien");
                    }

                }
            }

            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverNumero("un");
                        maisons[counter].enleverNationalite("Norvegien");
                    }
                }
            }


            System.out.println("9. The owner who plays the violin drinks beer.");

            index = -1;

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].loisirs.size() == 1) {
                    if (maisons[counter].containsLoisir("violon")) {
                        maisons[counter].reduireBoisson("bière");
                        index = counter;
                        System.out.println("violon");

                        break;
                    } else {
                        maisons[counter].enleverLoisir("violon");
                        maisons[counter].enleverBoisson("bière");
                    }
                } else if (maisons[counter].boissons.size() == 1) {
                    if (maisons[counter].containsBoisson("bière")) {
                        maisons[counter].reduireLoisir("violon");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverBoisson("bière");
                        maisons[counter].enleverLoisir("violon");
                    }


                }
            }
            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverBoisson("bière");
                        maisons[counter].enleverLoisir("violon");
                    }
                }
            }

            System.out.println("10. The owner of the yellow house plays the piano.");

            index = -1;

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].loisirs.size() == 1) {
                    if (maisons[counter].containsLoisir("piano")) {
                        maisons[counter].reduireCouleur("jaune");
                        index = counter;

                        break;
                    } else {
                        // une autre nationalite occupe la 1
                        maisons[counter].enleverLoisir("piano");
                        maisons[counter].enleverCouleur("jaune");
                    }
                } else if (maisons[counter].couleurs.size() == 1) {
                    if (maisons[counter].containsCouleur("jaune")) {
                        maisons[counter].reduireLoisir("piano");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverCouleur("jaune");
                        maisons[counter].enleverLoisir("piano");

                    }
                }
            }
            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverCouleur("jaune");
                        maisons[counter].enleverLoisir("piano");
                    }
                }
            }

            for (int country2 = 0; country2 < 5; country2++) {
                if (maisons[country2].loisirs.size() == 1) {
                    if (maisons[country2].loisirs.contains("football")) {
                        for (int country3 = 0; country3 < 5; country3++) {
                            if (country2 != country3) {
                                maisons[country3].enleverLoisir("football");
                            }
                        }
                    }
                }
            }

            System.out.println("11. The owner living in the center house drinks milk.");

            index = -1;

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].boissons.size() == 1) {
                    if (maisons[counter].containsBoisson("lait")) {
                        maisons[counter].reduireNumero("trois");
                        index = counter;
                        break;
                    } else {
                        // une autre nationalite occupe la 1
                        maisons[counter].enleverBoisson("lait");
                        maisons[counter].enleverNumero("trois");
                    }
                } else if (maisons[counter].numero.size() == 1) {
                    if (maisons[counter].containsNumero("trois")) {
                        maisons[counter].reduireBoisson("lait");
                        index = counter;
                        break;
                    } else {
                        maisons[counter].enleverBoisson("lait");
                        maisons[counter].enleverNumero("trois");

                    }

                }
            }
            if (index > -1) {
                for (int counter = 0; counter < N; counter++) {
                    if (counter != index) {
                        maisons[counter].enleverBoisson("lait");
                        maisons[counter].enleverNumero("trois");
                    }
                }
            }


            System.out.println("12. The owner who keeps the horse lives next to the one who plays the piano.");
            index = -1;
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].loisirs.size() == 1) {
                    if (maisons[counter].containsLoisir("piano")) {
                        maisons[counter].enleverAnimal("cheval");
                        break;
                    }
                }
            }

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].animaux.size() == 1) {
                    if (maisons[counter].containsAnimal("cheval")) {
                        maisons[counter].enleverLoisir("piano");
                        break;
                    }
                }
            }


            num = 0;
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].loisirs.size() == 1 && maisons[counter].loisirs.contains("piano")) {
                    if (maisons[counter].numero.size() == 1) {
                        Set<String> tmp = maisons[counter].getNumero();
                        if (tmp.contains("un")) {
                            num = 1;
                        } else if (tmp.contains("deux")) {
                            num = 2;
                        } else if (tmp.contains("trois")) {
                            num = 3;
                        } else if (tmp.contains("quatre")) {
                            num = 4;
                        } else if (tmp.contains("cinq")) {
                            num = 5;
                        }
                        maisons[num - 1].enleverAnimal("cheval");
                        int neighbourNumberL = num - 1;
                        int neighbourNumberR = num + 1;
                        for (int counter2 = neighbourNumberR; counter2 < 5; counter2++) {
                            maisons[counter2].enleverAnimal("cheval");
                        }
                        ;
                        if (neighbourNumberL == 0) {
                            maisons[neighbourNumberR - 1].reduireAnimal("cheval");
                        }

                        for (int counter2 = 0; counter2 < neighbourNumberL; counter2++) {
                            maisons[counter2].enleverAnimal("bleu");
                        }
                    }
                }
            }
            System.out.println("13. The green house is on the immediate left of the white house.");
            // white is not one

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].numero.size() == 1) {
                    if (maisons[counter].containsNumero("un")) {
                        maisons[counter].enleverCouleur("blanc");

                        index = counter;

                        break;
                    }
                }
            }
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].numero.size() == 1) {
                    if (maisons[counter].containsCouleur("blanc")) {
                        maisons[counter].enleverNumero("un");

                        index = counter;

                        break;
                    }
                }
            }

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].numero.size() == 1) {
                    if (maisons[counter].containsNumero("cinq")) {
                        maisons[counter].enleverCouleur("vert");

                        index = counter;

                        break;
                    }
                }
            }
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].numero.size() == 5) {
                    if (maisons[counter].containsCouleur("vert")) {
                        maisons[counter].enleverNumero("cinq");

                        index = counter;

                        break;
                    }
                }
            }
            int counter3 = 0;
            for (int country2 = 0; country2 < maisons.length - 1; country2++) {
                counter3 = counter3 + 1;

                if (maisons[country2].containsCouleur("vert")) {

                    if (maisons[counter3].containsCouleur("blanc")) {

                    } else {
                        maisons[country2].enleverCouleur("vert");
                    }
                }

            }

            int counter4 = 0;
            for (int country2 = 1; country2 < 5; country2++) {
                if( maisons[country2].containsCouleur("blanc")) {

                    if (!maisons[counter4].containsCouleur("vert")) {
                        maisons[country2].enleverCouleur("blanc");

                    } else {
                    }
                }
                counter4++;

            }






            System.out.println("14. The Norwegian lives next to the blue house.");

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].nationalites.size() == 1) {
                    if (maisons[counter].containsNationalite("Norvegien")) {
                        maisons[counter].enleverCouleur("bleu");
                        break;
                    }
                }
            }

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].couleurs.size() == 1) {
                    if (maisons[counter].containsCouleur("bleu")) {
                        maisons[counter].enleverNationalite("Norvegien");
                        break;
                    }
                }
            }


             num = 0;
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].nationalites.size() == 1 && maisons[counter].nationalites.contains("Norvegien")) {
                    if (maisons[counter].numero.size() == 1) {
                        Set<String> tmp = maisons[counter].getNumero();
                        if (tmp.contains("un")) {
                            num = 1;
                        } else if (tmp.contains("deux")) {
                            num = 2;
                        } else if (tmp.contains("trois")) {
                            num = 3;
                        } else if (tmp.contains("quatre")) {
                            num = 4;
                        } else if (tmp.contains("cinq")) {
                            num = 5;
                        }
                        maisons[num - 1].enleverCouleur("bleu");
                        int neighbourNumberL = num - 1;
                        int neighbourNumberR = num + 1;
                        for (int counter2 = neighbourNumberR; counter2 < 5; counter2++) {
                            maisons[counter2].enleverCouleur("bleu");
                        }
                        ;
                        if (neighbourNumberL == 0) {
                            maisons[neighbourNumberR - 1].reduireCouleur("bleu");
                        }

                        for (int counter2 = 0; counter2 < neighbourNumberL; counter2++) {
                            maisons[counter2].enleverCouleur("bleu");

                        }
                    }
                }
            }
            System.out.println("15. The owner who plays basketball lives next to the one who drinks water.");

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].loisirs.size() == 1) {
                    if (maisons[counter].containsLoisir("basketball")) {
                        maisons[counter].enleverBoisson("eau");
                        break;
                    }
                }
            }

            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].loisirs.size() == 1) {
                    if (maisons[counter].containsBoisson("eau")) {
                        maisons[counter].enleverLoisir("basketball");
                        break;
                    }
                }
            }


             num = 0;
            for (int counter = 0; counter < N; counter++) {
                if (maisons[counter].boissons.size() == 1 && maisons[counter].boissons.contains("eau")) {
                    if (maisons[counter].numero.size() == 1) {
                        Set<String> tmp = maisons[counter].getNumero();
                        System.out.println(tmp);
                        if (tmp.contains("un")) {
                            num = 1;
                        } else if (tmp.contains("deux")) {
                            num = 2;
                        } else if (tmp.contains("trois")) {
                            num = 3;
                        } else if (tmp.contains("quatre")) {
                            num = 4;
                        } else if (tmp.contains("cinq")) {
                            num = 5;
                        }
                        maisons[num - 1].enleverLoisir("basketball");
                        int neighbourNumberL = num - 1;
                        int neighbourNumberR = num + 1;
                        for (int counter2 = neighbourNumberR; counter2 < 5; counter2++) {
                            maisons[counter2].enleverLoisir("basketball");
                        }
                        ;
                        if (neighbourNumberL == 0) {
                            maisons[neighbourNumberR - 1].reduireLoisir("basketball");
                        }

                        for (int counter2 = 0; counter2 < neighbourNumberL; counter2++) {
                            maisons[counter2].enleverLoisir("basketball");;
                        }
                    }
                }
            }

            for (int country2=0;country2<5; country2++ ) {
                if(maisons[country2].boissons.size()==1){
                    if (maisons[country2].boissons.contains("eau")){
                        for (int country3=0;country3<5; country3++ ){
                            if (country2!= country3){
                                maisons[country3].enleverBoisson("eau");
                            }
                        }
                    }


                }
            }


                    maisons[0].afficher();
                    maisons[1].afficher();
                    maisons[2].afficher();
                    maisons[3].afficher();
                    maisons[4].afficher();



        }
    }




                public static int[] setdiff(int[] nb, int valueToRemove){
                    int count = 0;
                    for (int num2 : nb) {
                        if (num2 != valueToRemove) {
                            count++;
                        }
                    }
                int[] result = new int[count];
                int index = 0;
                for (int num2 : nb) {
                    if (num2 != valueToRemove) {
                        result[index++] = num2;
                    }
                }
                return result;
            }
        }





