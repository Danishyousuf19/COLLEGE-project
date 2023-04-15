# COLLEGE-project

*****************************************************************************************************************************************************
Problem Statement: To design a Affine chiper.
Problem Description: In cryptography the general idea of a symmetric chiper is that the
sender can send a message to a receiver, over an insecure channel with the assumption that
an adversary, cannot understand the contents of the message by simply eavesdropping over
the channel. Let the sender is Alice and the receiver is Bob. The original message sent from
Alice to Bob is called plaintext; and the message that is sent through the channel is called
the ciphertext. To create the ciphertext from the plaintext, Alice uses an encryption algorithm
and a shared secret key. To create the plaintext from ciphertext, Bob uses a decryption
algorithm and the same secret key. 
The simplest monoalphabetic cipher is the additive cipher. Here, the encryption algorithm
adds the key to the plaintext character; the decryption algorithm subtracts the key from the
ciphertext character. The following figure shows the logic of additive chiper.
In a multiplicative cipher, the encryption algorithm multiplies the plaintext characters by the
key and the decryption algorithm divides the ciphertext characters by the key as shown in
the following Figure.
In this project our goal is to design a Affine chiper. Here, we can combine the additive and
multiplicative ciphers with a pair of keys to get what is called the affine cipher. The first
key is used with the multiplicative cipher; the second key is used with the additive cipher.
The following figure shows that the affine cipher is actually two ciphers, applied one after
another.
In the affine cipher, the relationship between the plaintext P and the ciphertext C is 
C = (P k1 + k2) mod 26 × k1 + k2) mod 26 
P = ((C k2) k1 − k2) × k1 × k1 + k2) mod 26 − k2) × k11
) mod 26
Representation of plaintext and ciphertext characters in Z26 is shown below.
Example: Using affine cipher encrypt the message “hello” then decript with key pair (7, 2).
Encryption: 
We use 7 for the multiplicative key and 2 for the additive key. We get “ZEBBW”.
Decryption:
Add the additive inverse of 2 24 (mod 26) to the received ciphertext. Then multiply the − k2) × k1 ≡ 24 (mod 26) to the received ciphertext. Then multiply the
result by the multiplicative inverse of 7− k2) × k11 15 (mod 26) to find the plaintext “hello”. ≡ 24 (mod 26) to the received ciphertext. Then multiply the
Definitions:
1. Additive Inverse : In Zn
, two numbers a and b are additive inverses of each other if 
a + b 0 (mod n) ≡ 24 (mod 26) to the received ciphertext. Then multiply the
For example, the additive inverse of 4 in Z10 is 10 4 = 6. − k2) × k1
2. Multiplicative Inverse : In Zn
, two numbers a and b are the multiplicative inverse of
each other if
a b 1 (mod n) × k1 + k2) mod 26 ≡ 24 (mod 26) to the received ciphertext. Then multiply the
For example, if the modulus is 10, then the multiplicative inverse of 3 is 7. 
In other words, we have (3 7) mod 10 = 1. × k1 + k2) mod 26 
Programming Demonstartion:
