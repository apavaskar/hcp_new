package com.squer.prorpel.utils

import org.jasypt.util.text.BasicTextEncryptor
import org.apache.commons.codec.binary.Hex
import java.nio.charset.StandardCharsets
import java.rmi.server.UID
import java.security.Key
import java.security.MessageDigest
import java.util.*
import javax.crypto.spec.SecretKeySpec

class StringUtils {
    companion object {
        private final val ALGO: String = "PBEWithMD5AndTripleDES"
        private val keyValue = "SQUER_CERTIFICATE".toByteArray()
        private val values = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3',
                '4', '5', '6', '7', '8', '9')
        private val encryptor: BasicTextEncryptor = BasicTextEncryptor()

        init {
            encryptor.setPassword("SQUER")
        }


        @Throws(java.lang.Exception::class)
        public fun encrypt(data: String?): String? {
            /**
             * Key key = generateKey();
             * Cipher c = Cipher.getInstance(ALGO);
             * c.init(Cipher.ENCRYPT_MODE, key);
             * byte[] encVal = c.doFinal(Data.getBytes("UTF-8"));
             * return new String(Hex.encodeHex(encVal));
             */
            return encryptor.encrypt(data)
        }

        @Throws(Exception::class)
        public fun getHash(value: String): String? {
            val digest = MessageDigest.getInstance("SHA-256")
            digest.reset()
            digest.update(value.toByteArray(StandardCharsets.UTF_8))
            val shaDig = digest.digest()
            return String(Hex.encodeHex(shaDig))
        }

        @Throws(Exception::class)
        public fun decrypt(encryptedData: String?): String? {
            /**
             * Key key = generateKey();
             * Cipher c = Cipher.getInstance(ALGO);
             * c.init(Cipher.DECRYPT_MODE, key);
             * byte[] decValue = c.doFinal(Hex.decodeHex(encryptedData.toCharArray()));
             * return new String(decValue);
             */
            return encryptor.decrypt(encryptedData)
        }


        fun generateRandomString(length: Int): String? {
            val random = Random(Date().time)
            var out = ""
            for (i in 0 until length) {
                val idx = random.nextInt(values.size)
                out += values.get(idx)
            }
            return out
        }


        @Throws(Exception::class)
        private fun generateKey(): Key? {
            return SecretKeySpec(keyValue, ALGO)
        }

        fun getUID(): String? {
            var uidString = "00000000000000000000000000000000" + UID().toString()
            uidString = uidString.substring(uidString.length - 32)
            uidString = uidString.replace(':', '0')
            uidString = uidString.replace('-', '0')
            return uidString
        }

        fun isNullOrEmpty(value: String?): Boolean {
            return value == null || "" == value
        }


        @Throws(Exception::class)
        fun generateOtp(): String? {
            val numbers: MutableList<Int?> = ArrayList()
            for (i in 0..9) {
                numbers.add(i)
            }
            Collections.shuffle(numbers)
            var result = ""
            for (i in 0..3) {
                result += numbers[i].toString()
            }
            println(result)
            return result
        }
    }
}