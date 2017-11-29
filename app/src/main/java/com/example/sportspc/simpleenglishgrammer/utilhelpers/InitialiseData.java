package com.example.sportspc.simpleenglishgrammer.utilhelpers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SportsPc on 11/20/2017.
 */

public class InitialiseData {
    public static List data, data1;

    public static List getPagesList(String categoryName) {
        data = new ArrayList<String>();
        data1 = new ArrayList<String>();
       /* if (categoryName.equalsIgnoreCase("grammar/Tenses")) {
            p = new Intent(this, MainPageActivity.class);
            p.putExtra("name", categoryName);
            finish();
            startActivity(p);
        } else if (categoryName.equalsIgnoreCase("grammar/Trial Questions")) {
            p = new Intent(this, MainPageActivity.class);
            p.putExtra("name", categoryName);
            finish();
            startActivity(p);*/
        if (categoryName.equalsIgnoreCase("grammar/Introduction")) {
            data.add("Introduction.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Verbs")) {
            data.add("What are verbs.html");
            data.add("Main verbs.html");
            data.add("Helping verbs.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Adverbs")) {
            data.add("Function.html");
            data.add("Position.html");
            data.add("Form.html");
            data.add("Adverbs of Certainty.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Conjunctions")) {
            data.add("Conjunctions.html");
            data.add("Coordinating conjunctions.html");
            data.add("Subordinating conjunctions.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Interjections")) {
            data.add("Interjections.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Tenses/Future tense")) {
            data.add("Simple future tense.html");
            data.add("Future continuous tense.html");
            data.add("Future perfect tense.html");
            data.add("Future perfect continuous tense.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Tenses/Past tense")) {
            data.add("Simple past.html");
            data.add("Past continuous tense.html");
            data.add("Past perfect tense.html");
            data.add("Past perfect continuous.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Determiners")) {
            data.add("Introduction.html");
            data.add("Types.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Tenses/Present tense")) {
            data.add("Simple present tense.html");
            data.add("Present continuous.html");
            data.add("Present perfect tense.html");
            data.add("Present perfect continuous tense.html");
            data.add("For continuing situation.html");
            data.add("For change.html");
            data.add("For experience.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Tenses/Introduction")) {
            data.add("Tenses.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Pronouns")) {
            data.add("Pronouns.html");
            data.add("Pronoun case.html");
            data.add("Personal Pronouns.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Prepositions")) {
            data.add("prepositions.html");
            data.add("preposition list.html");
            data.add("preposition rule.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Active Or Passive Voice")) {
            data.add("Introduction.html");
            data.add("Rules.html");
            data.add("Examples.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Adjectives")) {
            data.add("Adjectives.html");
            data.add("Comparison of Adjectives.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Nouns")) {
            data.add("Nouns.html");
            data.add("Proper Nouns and Common Nouns.html");
            data.add("Countable and Uncountable Nouns.html");
            data.add("Compund Nouns.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Reported Speech")) {
            data.add("Introduction.html");
            data.add("Reported Statements.html");
            data.add("Reported Questions.html");
            data.add("Reported Orders.html");
            data.add("Time Expressions.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Prepositions")) {
            data.add("prepositions.html");
            data.add("preposition  rule.html");
            data.add("preposition list.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Phrases")) {
            data.add("Introduction.html");
            data.add("Types Of Phrases.html");
            data.add("Types Of Phrases Cont'd.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Idioms")) {
            data.add("Introduction.html");
            data.add("Examples.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Auxiliary Verbs")) {
            data.add("Introduction.html");
            data.add("Statements and Questions.html");
            data.add("usage.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Articles")) {
            data.add("Introduction.html");
            data.add("Usage.html");
        } else if (categoryName.equalsIgnoreCase("grammar/Question Tags")) {
            data.add("Introduction.html");
            data.add("Rules.html");
            data.add("Example.html");
        } else {
            System.out.println("rrrr" + categoryName);
           /* try {
                data1 = getResources().getAssets().list(categoryName);
            } catch (Exception e) {
            }
            for (String names : data1) {
                data.add(names);
            }
            for (int j = 0; j < data1.length; j++) {
            }
            return data1;*/
        }
        return data;

    }
}
