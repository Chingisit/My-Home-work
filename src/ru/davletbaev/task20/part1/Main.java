package ru.davletbaev.task20.part1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("����", "������");
        map.put("����", "������");
        map.put("������", "�������");
        map.put("������", "��������");
        map.put("�����", "��������");
        System.out.println(isUnique(map));

        map.put("������", "������");
        map.put("�����", "������");
        System.out.println(isUnique(map));

    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> uniqueSet = new HashSet<>();
        uniqueSet.addAll(map.values());

        if (map.values().size() == uniqueSet.size()) {
            return false;
        }
        return true;
    }

}
