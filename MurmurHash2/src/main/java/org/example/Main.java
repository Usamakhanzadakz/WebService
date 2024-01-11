package org.example;

public class Main {
    public static void main(String[] args) {
                   String input = "Hello, MurmurHash3!";
            HashFunction murmur3 = Hashing.murmur3_128();

            HashCode hashCode = murmur3.newHasher()
                    .putString(input, java.nio.charset.StandardCharsets.UTF_8)
                    .hash();

            System.out.println("MurmurHash3 Value: " + hashCode);
        }
        System.out.println("Hello world!");

}