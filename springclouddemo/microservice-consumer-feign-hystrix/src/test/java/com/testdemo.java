package com;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lv.cloud.util.Base64Util;
import com.lv.cloud.util.Md5Utils;
import org.junit.Test;

import java.io.InputStream;
import java.util.*;
import java.util.concurrent.locks.Condition;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/5/7 9:38
 * version $Id: testdemo.java$
 */
public class testdemo {


    private List<Person> buildModel() {
        List<Person> peoples = new ArrayList<>();

        Person p1 = new Person("zs", "y", 23);
        Person p2 = new Person("zs", "m", 34);
        Person p3 = new Person("zs", "e", 32);

        Person p4 = new Person("ls", "y", 54);
        Person p5 = new Person("ls", "m", 46);
        Person p6 = new Person("ls", "e", 63);

        Person p7 = new Person("ww", "y", 76);
        Person p8 = new Person("ww", "m", 47);
        Person p9 = new Person("ww", "e", 86);


        peoples.add(p1);
        peoples.add(p2);
        peoples.add(p3);
        peoples.add(p4);
        peoples.add(p5);
        peoples.add(p6);
        peoples.add(p7);
        peoples.add(p8);
        peoples.add(p9);

        return peoples;
    }

    @Test
    public void test1() throws JsonProcessingException {

        List<Person> peoples = buildModel();

        ObjectMapper objectMapper = new ObjectMapper();

        final Map<String, Integer> map = new HashMap<>();
        peoples.forEach(item -> {
            if (map.containsKey(item.getName())) {
                map.put(item.getName(), map.get(item.getName()) + item.getScore());
            } else {
                map.put(item.getName(), item.getScore());
            }
        });

        System.out.println(objectMapper.writeValueAsString(map));
    }

    @Test
    public void test2() throws JsonProcessingException {
        List<Person> list = buildModel();
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, Integer> map = new HashMap<>();

        list.forEach(item -> {
            map.merge(item.getName(), item.getScore(),(a, b) -> a + b);
        });
        System.out.println(objectMapper.writeValueAsString(map));


        Condition c ;

    }

    @Test
    public void test3(){
        List<Person> list = buildModel();

        Set<String> strSet = new HashSet<>();
        List<Person> personList = new ArrayList<>();

        for(Person p : list){
            if(strSet.add(p.getName())){
                personList.add(p);
            }
        }

        System.out.println(personList);

    }

    @Test
    public void test4(){
        String str = "1315215";
        System.out.println(Md5Utils.MD5Encode(str));
        System.out.println("--");
        System.out.println(Base64Util.encodeData(str));
        System.out.println(Base64Util.decodeData(Base64Util.encodeData(str)));

        HashMap hashMap = new HashMap();
        hashMap.put(str,"ccc");
        hashMap.get(str);
        System.out.println("------------");
        int h = str.hashCode();
        System.out.println(h);
        System.out.println(h >>> 16);
        System.out.println(h ^ (h >>> 16));
        System.out.println(h/(2^16));
        System.out.println(16>>>3);
        System.out.println(2044961203/113609732);
    }

    @Test
    public void test5(){

        Random ran = new Random(-229985452);
        StringBuilder sb = new StringBuilder();
        while (true){
            int k = ran.nextInt(27);
            if (k == 0)
                break;
            System.out.println(k);
            sb.append((char)('`' + k));
        }
        sb.append(" ");
         ran = new Random(-147909649);
        while (true){
            int k = ran.nextInt(27);
            if (k == 0)
                break;
            sb.append((char)('`' + k));
        }
        System.out.println(sb.toString());

        InputStream is;

    }
}
