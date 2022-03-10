package com.example.recycler_view_examp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
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
        binding.recycleView.layoutManager = LinearLayoutManager(activity)
        val adapter = NameAdapter(requireActivity(),getStudentName())
        binding.recycleView.adapter = adapter
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
    class NameAdapter(val context: Context, val studentList: List<String>):RecyclerView.Adapter<NameAdapter.NameHolderr>(){

        class NameHolderr(val view: View):RecyclerView.ViewHolder(view) {
            val stdName:TextView = view.findViewById(R.id.txtStudentName)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameHolderr {
            val layout = LayoutInflater.from(context).inflate(R.layout.single_row_student,parent,false)
            return NameHolderr(layout)
        }

        override fun onBindViewHolder(holder: NameHolderr, position: Int) {
            val name = studentList[position]
            holder.stdName.text = name
        }

        override fun getItemCount(): Int {
            return studentList.size
        }

    }
}