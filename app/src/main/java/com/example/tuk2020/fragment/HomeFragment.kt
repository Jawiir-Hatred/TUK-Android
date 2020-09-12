package com.example.tuk2020.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.tuk2020.R
import com.example.tuk2020.adapter.AdapterMahasiswa
import com.example.tuk2020.adapter.AdapterSlider
import com.example.tuk2020.model.Mahasiswa
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    lateinit var vpSlider : ViewPager
    lateinit var rvMahasiswa: RecyclerView
    lateinit var rvMahasiswaTIA: RecyclerView
    lateinit var rvMahasiswaTIB: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)
        rvMahasiswa = view.findViewById(R.id.rv_mahasiswa)
        rvMahasiswaTIA = view.findViewById(R.id.rv_mahasiswaTIA)
        rvMahasiswaTIB = view.findViewById(R.id.rv_mahasiswaTIB)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManagerTIA = LinearLayoutManager(activity)
        layoutManagerTIA.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManagerTIB = LinearLayoutManager(activity)
        layoutManagerTIB.orientation = LinearLayoutManager.HORIZONTAL


        rvMahasiswa.adapter = AdapterMahasiswa(arrMahasiswa)
        rvMahasiswa.layoutManager = layoutManager

        rvMahasiswaTIA.adapter = AdapterMahasiswa(arrMahasiswaTIA)
        rvMahasiswaTIA.layoutManager = layoutManagerTIA

        rvMahasiswaTIB.adapter = AdapterMahasiswa(arrMahasiswaTIB)
        rvMahasiswaTIB.layoutManager = layoutManagerTIB

        return view
    }

    val arrMahasiswa: ArrayList<Mahasiswa>get(){
        val arr = ArrayList<Mahasiswa>()
        val m1 = Mahasiswa()
        m1.nama = "Priaji Oktawibyan Abror"
        m1.nim = "M3118069"
        m1.gambar = R.drawable.mahasiswa1

        val m2 = Mahasiswa()
        m2.nama = "Qona'ah Nurussalamah"
        m2.nim = "M3118070"
        m2.gambar = R.drawable.mahasiswa2

        val m3 = Mahasiswa()
        m3.nama = "Qonita Prasetyowati"
        m3.nim = "M3118071"
        m3.gambar = R.drawable.mahasiswa3

        val m4 = Mahasiswa()
        m4.nama = "Raihan Marwanda"
        m4.nim = "M3118072"
        m4.gambar = R.drawable.mahasiswa4

        val m5 = Mahasiswa()
        m5.nama = "Ramadhan Wahyu I. P."
        m5.nim = "M3118073"
        m5.gambar = R.drawable.mahasiswa5

        arr.add(m1)
        arr.add(m2)
        arr.add(m3)
        arr.add(m4)
        arr.add(m5)

        return arr


    }

    val arrMahasiswaTIA: ArrayList<Mahasiswa>get(){
        val arr = ArrayList<Mahasiswa>()
        val m1 = Mahasiswa()
        m1.nama = "Priaji Oktawibyan Abror"
        m1.nim = "M3118069"
        m1.gambar = R.drawable.mahasiswa1

        val m2 = Mahasiswa()
        m2.nama = "Qona'ah Nurussalamah"
        m2.nim = "M3118070"
        m2.gambar = R.drawable.mahasiswa2

        val m3 = Mahasiswa()
        m3.nama = "Qonita Prasetyowati"
        m3.nim = "M3118071"
        m3.gambar = R.drawable.mahasiswa3

        val m4 = Mahasiswa()
        m4.nama = "Raihan Marwanda"
        m4.nim = "M3118072"
        m4.gambar = R.drawable.mahasiswa4

        val m5 = Mahasiswa()
        m5.nama = "Ramadhan Wahyu I. P."
        m5.nim = "M3118073"
        m5.gambar = R.drawable.mahasiswa5

        arr.add(m1)
        arr.add(m2)
        arr.add(m3)
        arr.add(m4)
        arr.add(m5)

        return arr


    }

    val arrMahasiswaTIB: ArrayList<Mahasiswa>get(){
        val arr = ArrayList<Mahasiswa>()
        val m1 = Mahasiswa()
        m1.nama = "Priaji Oktawibyan Abror"
        m1.nim = "M3118069"
        m1.gambar = R.drawable.mahasiswa1

        val m2 = Mahasiswa()
        m2.nama = "Qona'ah Nurussalamah"
        m2.nim = "M3118070"
        m2.gambar = R.drawable.mahasiswa2

        val m3 = Mahasiswa()
        m3.nama = "Qonita Prasetyowati"
        m3.nim = "M3118071"
        m3.gambar = R.drawable.mahasiswa3

        val m4 = Mahasiswa()
        m4.nama = "Raihan Marwanda"
        m4.nim = "M3118072"
        m4.gambar = R.drawable.mahasiswa4

        val m5 = Mahasiswa()
        m5.nama = "Ramadhan Wahyu I. P."
        m5.nim = "M3118073"
        m5.gambar = R.drawable.mahasiswa5

        arr.add(m1)
        arr.add(m2)
        arr.add(m3)
        arr.add(m4)
        arr.add(m5)

        return arr


    }
}