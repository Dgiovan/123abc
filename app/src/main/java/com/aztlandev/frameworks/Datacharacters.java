package com.aztlandev.frameworks;


import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;

import com.aztlandev.Utils.Constants;

import java.util.ArrayList;

public class Datacharacters {
    public static final String TAG = Datacharacters.class.getCanonicalName();
    /**@param group recibe un arreglo a evaluar puede ser abecedario o vocales o cualquiera
     * @param elements cantidad de posiciones para enviar un elemento de group
     * la cantidad de elementos debe ser par
     * @var pair devolvera un par de elementos de abcedario o de vocales o de numeros **/
    public static ArrayList<String> getPairs(ArrayList<String> group,int elements)
    {
        ArrayList<String> pair = new ArrayList<>();
        ArrayList<Integer> positions = new ArrayList<>();
       if (elements>2 && elements%2==0)
       {
           for (int i = 0 ; i<elements/2;i++)
           {
               int random =(int) Math.floor(Math.random()*(1-(group.size()+1))+(group.size()));

               if (positions.size()==0){
                   positions.add(random);
               }else {
                   if (!existRandom(random,positions))
                   {
                       positions.add(random);
                   }else {
                       i--;
                   }
               }

           }
           for (int j =0;j<positions.size();j++)
           {
               pair.add(group.get(positions.get(j)<0?0:positions.get(j)));
               pair.add(group.get(positions.get(j)<0?0:positions.get(j)));

           }
       }
       else
       {pair.add(Constants.EXEPCION_PAIR);}


        return pair;
    }
    private static boolean existRandom(int random, ArrayList<Integer> positions) {
        boolean exist=false;
        for (int k= 0; k<positions.size();k++)
        {
            if (positions.get(k)==random)
            {
                exist=true;
            }
        }
        return exist;
    }



    /**Funcion evalua si el par es identico usa como argumentos 2 String
     * @param a
     * @param b**/
    public static boolean evaluepair(String a,String b){
        if (TextUtils.isEmpty(a)||TextUtils.isEmpty(b))
        {
            Log.e(TAG,"alguno de tus argumentos esta vacio");
            return false;

        }else {
            return TextUtils.equals(a,b);
        }
    }
}
