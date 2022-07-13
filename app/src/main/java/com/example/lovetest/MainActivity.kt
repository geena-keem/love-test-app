package com.example.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    // lateinit: 전역변수로 선언 후 null값을 지정하지 않고 초기화를 할 수 있다.
    //           var 키워드를 사용하여 선언한 경우에만 사용이 가능하다.
    //           primitive type 및 getter & setter에 적용할 수 없다.
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        navController = findNavController(R.id.nav_host_fragment)
        var navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        var navController = navHostFragment.navController
    }
}