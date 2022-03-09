package com.example.recycler_view_examp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view_examp.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding:FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    public fun getStudentName():List<String>{
        val nameList = listOf<String>(
            "Rohit Rai",
            "Abhishek Sahu",
            "Chandan Tripathi",
            "Desh Raj",
            "Durga Rajbhar",
            "Nikhlesh Sinha",
            "Shubham Yadav",
            "Sumeet Kumar Gupta",
            "Rajat Tomar",
            "Digvijay Singh",
            "Priyanshu Kesari",
            "Happy Singh",
            "Akash Verma",
            "Ayush Srivastava",
            "Adarsh Sahu",
            "Juheb Khan",
            "Pratima",
            "Neha",
            "Subhadra Upadhyay",
            "Khushbu Yadav",
            "Manisha Kumari Vishwakarm",
            "Harpreet Singh",
            "Ujjawal Shukla",
            "Manoj Tiwari",
            "Yashi Saxena",
            "Ashindra Dwivedi",
            "Naushad Ahmad",
            "Komal Gautam",
            "Ravi Sharma",
            "Mohd Salman",
            "Ambuj Srivastava",
            "Shweta Pandey",
        )
        return nameList
    }
    class NameAdapter(val studentList: List<String>):RecyclerView.Adapter<NameAdapter.NameHolderr>(){
        class NameHolder(val view:View):RecyclerView.ViewHolder(view) {

        }

        class NameHolderr(val view: View):RecyclerView.ViewHolder(view) {

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameHolderr {
            TODO("Not yet implemented")
        }

        override fun onBindViewHolder(holder: NameHolderr, position: Int) {
            TODO("Not yet implemented")
        }

        override fun getItemCount(): Int {
            TODO("Not yet implemented")
        }


    }
}