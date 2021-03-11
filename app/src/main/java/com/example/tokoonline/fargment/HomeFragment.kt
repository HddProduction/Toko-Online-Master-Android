package com.example.tokoonline.fargment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.tokoonline.R
import com.example.tokoonline.adapter.AdapterProduk
import com.example.tokoonline.adapter.AdapterSlider
import com.example.tokoonline.model.Produk


class HomeFragment : Fragment() {

    lateinit var  vpSlider : ViewPager
    lateinit var  rvProduk : RecyclerView
    lateinit var  rvProdukTerlaris : RecyclerView
    lateinit var  rvProdukDiskon : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view : View = inflater.inflate(R.layout.fragment_home, container, false)
        vpSlider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvProdukTerlaris = view.findViewById(R.id.rv_produkTerlaris)
        rvProdukDiskon = view.findViewById(R.id.rv_produkDiskon)

        val arrSlidder = ArrayList<Int>()
        arrSlidder.add(R.drawable.slider1)
        arrSlidder.add(R.drawable.slider2)
        arrSlidder.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlidder, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        rvProdukTerlaris.adapter = AdapterProduk(arrProdukTerlaris)
        rvProdukTerlaris.layoutManager = layoutManager2

        rvProdukDiskon.adapter = AdapterProduk(arrProdukDiskon)
        rvProdukDiskon.layoutManager = layoutManager3
        return view
    }

    val arrProduk : ArrayList<Produk>get()
    {
        val arr = ArrayList<Produk>()
        val p1  = Produk()
        p1.nama     = "LENOVO IDEAPAD 330"
        p1.harga    = "Rp.50.000.000"
        p1.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p2  = Produk()
        p2.nama     = "LENOVO IDEAPAD 332"
        p2.harga    = "Rp.50.000.000"
        p2.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p3  = Produk()
        p3.nama     = "LENOVO IDEAPAD 334"
        p3.harga    = "Rp.50.000.000"
        p3.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p4  = Produk()
        p4.nama     = "LENOVO IDEAPAD 334"
        p4.harga    = "Rp.50.000.000"
        p4.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p5  = Produk()
        p5.nama     = "LENOVO IDEAPAD 334"
        p5.harga    = "Rp.50.000.000"
        p5.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p6  = Produk()
        p6.nama     = "LENOVO IDEAPAD 334"
        p6.harga    = "Rp.50.000.000"
        p6.gambar   = R.drawable.hp_notebook_14_bs710tu
        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)
        arr.add(p5)
        arr.add(p6)

        return arr
    }

    val arrProdukTerlaris : ArrayList<Produk>get()
    {
        val arr = ArrayList<Produk>()
        val p1  = Produk()
        p1.nama     = "LENOVO IDEAPAD 330"
        p1.harga    = "Rp.50.000.000"
        p1.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p2  = Produk()
        p2.nama     = "LENOVO IDEAPAD 332"
        p2.harga    = "Rp.50.000.000"
        p2.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p3  = Produk()
        p3.nama     = "LENOVO IDEAPAD 334"
        p3.harga    = "Rp.50.000.000"
        p3.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p4  = Produk()
        p4.nama     = "LENOVO IDEAPAD 334"
        p4.harga    = "Rp.50.000.000"
        p4.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p5  = Produk()
        p5.nama     = "LENOVO IDEAPAD 334"
        p5.harga    = "Rp.50.000.000"
        p5.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p6  = Produk()
        p6.nama     = "LENOVO IDEAPAD 334"
        p6.harga    = "Rp.50.000.000"
        p6.gambar   = R.drawable.hp_notebook_14_bs710tu
        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)
        arr.add(p5)
        arr.add(p6)

        return arr
    }

    val arrProdukDiskon : ArrayList<Produk>get()
    {
        val arr = ArrayList<Produk>()
        val p1  = Produk()
        p1.nama     = "LENOVO IDEAPAD 330"
        p1.harga    = "Rp.50.000.000"
        p1.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p2  = Produk()
        p2.nama     = "LENOVO IDEAPAD 332"
        p2.harga    = "Rp.50.000.000"
        p2.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p3  = Produk()
        p3.nama     = "LENOVO IDEAPAD 334"
        p3.harga    = "Rp.50.000.000"
        p3.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p4  = Produk()
        p4.nama     = "LENOVO IDEAPAD 334"
        p4.harga    = "Rp.50.000.000"
        p4.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p5  = Produk()
        p5.nama     = "LENOVO IDEAPAD 334"
        p5.harga    = "Rp.50.000.000"
        p5.gambar   = R.drawable.hp_notebook_14_bs710tu

        val p6  = Produk()
        p6.nama     = "LENOVO IDEAPAD 334"
        p6.harga    = "Rp.50.000.000"
        p6.gambar   = R.drawable.hp_notebook_14_bs710tu
        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)
        arr.add(p5)
        arr.add(p6)

        return arr
    }
}