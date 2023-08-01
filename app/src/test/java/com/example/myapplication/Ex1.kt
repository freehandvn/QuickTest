package com.example.myapplication

operator fun Iterable<Int>.unaryMinus():List<Int> = map { -it }
