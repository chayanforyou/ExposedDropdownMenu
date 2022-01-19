package me.chayan.exposeddropdownmenu

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import me.chayan.exposeddropdownmenu.adapter.DistrictArrayAdapter
import me.chayan.exposeddropdownmenu.adapter.DivisionArrayAdapter
import me.chayan.exposeddropdownmenu.utils.Utils

class MainActivity : AppCompatActivity() {

    private var division: String? = null
    private var district: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Populated dropdown with division name
        val divisions = Utils.getDivisions(this)
        val divisionArrayAdapter = DivisionArrayAdapter(this, divisions)
        divisionDropdown.setAdapter(divisionArrayAdapter)

        divisionDropdown.setOnItemClickListener { parent, v, position, id ->
            division = divisionArrayAdapter.getItem(position)?.divisionNameBangla
            Toast.makeText(applicationContext, division, Toast.LENGTH_SHORT).show()
        }

        // Populated dropdown with district name
        val districts = Utils.getDistricts(this)
        val districtArrayAdapter = DistrictArrayAdapter(this, districts)
        districtDropdown.setAdapter(districtArrayAdapter)

        districtDropdown.setOnItemClickListener { parent, v, position, id ->
            district = districtArrayAdapter.getItem(position)?.districtNameBangla
            Toast.makeText(applicationContext, district, Toast.LENGTH_SHORT).show()
        }

        btnNext.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "${getString(R.string.division)}: $division, ${getString(R.string.district)}: $district",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}