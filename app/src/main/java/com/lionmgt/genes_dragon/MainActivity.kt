package com.lionmgt.genes_dragon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = paperFolding(8)
        println(result)

        val l0 = "1"
        val l1 = "110"
        val l2 = "1101100"
        val l3 = "110110011100100"
        val l8 = "110110011100100111011000110010011101100111001000110110001100100111011001110010" +
                "011101100011001000110110011100100011011000110010011101100111001001110110001100" +
                "100111011001110010001101100011001000110110011100100111011000110010001101100111" +
                "001000110110001100100111011001110010011101100011001001110110011100100011011000" +
                "110010011101100111001001110110001100100011011001110010001101100011001000110110" +
                "011100100111011000110010011101100111001000110110001100100011011001110010011101" +
                "1000110010001101100111001000110110001100100"




    }



    fun paperFolding(increment: Int): String {
        var string1 = "1"
        var string2 = ""
        var result = ""

        for (x in 1..increment) {
            var flag = "1"

            var string3 = string1.filter { it.isDigit() }
            string3.split("").forEach {
                // set string4 for each positional value in string3
                var string4 = flag + it
                // and append to string2
                string2 += string4

                // flip flag value
                if (flag == "0") {
                    flag = "1"
                } else {
                    flag = "0"
                }
            }
            // append final flag value
            string2.plus(flag)
            // append result of each iteration to result
            result += string2
            // replace starting value with result for next iteration
            string1 = result
            // reset interim string value
            string2 = ""
        }
        return string1

    }

}