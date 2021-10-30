package com.company.wrappers;

public class WrapperTest {
    public static void main(WrapperTest[] args) {
        Integer i1 = 85;
        Integer i2 = Integer.valueOf(85);
        Integer i3 = new Integer(85);
        Integer i4 = Integer.parseInt("85");

        Character c1 = 'v';
        Character c2 = Character.valueOf('v');
        Character c3 = new Character('v');

        Byte b1 = 45;
        Byte b2 = Byte.valueOf("45");
        Byte b3 = new Byte("45");
        Byte b4 = Byte.parseByte("45");

        Short s1 = 7;
        Short s2 = Short.valueOf("7");
        Short s3 = new Short("7");
        Short s4 = Short.parseShort("7");

        Long l1 = 1000l;
        Long l2 = Long.valueOf(1000);
        Long l3 = new Long(1000);
        Long l4 = Long.parseLong("1000");

        Float f1 = 500.8f;
        Float f2 = Float.valueOf("500.8");
        Float f3 = new Float(500.8);
        Float f4 = Float.parseFloat("500.8");

        Double d1 = 400.4d;
        Double d2 = Double.valueOf(400.4);
        Double d3 = new Double(400.4);
        Double d4 = Double.parseDouble("400.4");

        Boolean bl1 = true;
        Boolean bl2 = Boolean.valueOf(true);
        Boolean bl3 = new Boolean(true);
        Boolean bl4 = Boolean.parseBoolean("true");

        System.out.println("Integer\n" + i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + "\n" + "Character\n" + c1 + "\n" + c2 + "\n" + c3 + "\n" + "\n" + "Byte\n" + b1 + "\n" + b2 +
                "\n" + b3 + "\n" + b4 + "\n" + "\n" + "Short\n" + s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + "\n" + "Long\n" + l1 + "\n" + l2 + "\n" + l3 + "\n" + l4 + "\n" + "\n"
                + "Float\n" + f1 + "\n" + f2 + "\n" + f3 + "\n" + f4 + "\n" + "\n" + "Double\n" + d1 + "\n" + d2 + "\n" + d3 + "\n" + d4 + "\n" + "\n" + "Boolean\n" + bl1 + "\n" + bl2 + "\n"
                + bl3 + "\n" + bl4 + "\n" + "\n");

        Double d5 = 432.76d;
        byte b5 = d5.byteValue();
        short s5 = d5.shortValue();
        int i5 = d5.intValue();
        float f5 = d5.floatValue();
        long l5 = d5.longValue();

        System.out.println("Double -> " + d5 + "\n" + "byte -> " + b5 + "\n" + "short -> " + s5 + "\n" + "int -> " + i5 + "\n" + "float -> " + f5 + "\n" + "long -> " + l5 + "\n"+"\n");

        Double d6 = 0.0d;
        Double d7 = 4.0d;
        Double nanValue = d7/d6;
        Double infinityValue = d6/d6;
        System.out.println(nanValue+"\n"+infinityValue);

        if(Double.isNaN(nanValue)) {
            System.out.println("Переменная nanValue = NaN");
        }
        else if(Double.isNaN(infinityValue)) {
            System.out.println("Переменная InfinityValue = NaN");
        }
        if(Double.isInfinite(nanValue)) {
            System.out.println("Переменная nanValue = Infinity");
        }
        else if(Double.isInfinite(infinityValue)) {
            System.out.println("Переменная infinityValue = Infinity");
        }

        Long l7 = 120l;
        Long l8 = 120l;
        System.out.println(l7==l8);
        l7 =1200l;
        l8 =1200l;
        System.out.println(l7==l8);
        }
    }
