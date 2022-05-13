package com.example.controlnaya2;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import java.util.Scanner;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.controlnaya2", appContext.getPackageName());
    }
    public void mostRare(String str){
        //String Words[];
        int NumbOfWords=0;
        //
        for(int i = 0;i<str.length();i++){
           if(str.charAt(str.length()-i) == ' '){//watch at i-elem of str
               NumbOfWords++;
           }
        }
        NumbOfWords++;

        Object[] Dict = new Object[NumbOfWords];
        //Object[] values = getValues();



        String Words[];
        Words = new String[NumbOfWords];
        int n=0;
        String word = new Scanner(System.in).nextLine();
        for(int i = 0;i<str.length();i++){//Закидываем слова в массив строк
            char Char = str.charAt(str.length()-i);
            if(Char != ' '){//watch at i-elem of str
                word += Char;
            }else{
                Words[NumbOfWords-n] = word;
                n++;
                word.substring(0,word.length());
            }
            if((NumbOfWords-n) == (NumbOfWords-1)){//last word
                word += Char;
            }
        }
        Words[NumbOfWords-(n+1)] = word;
        //n++;
        //for()
        //



    }
}
//public class