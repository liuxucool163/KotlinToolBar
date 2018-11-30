package liu.jinyu.mykotlintoolbar

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class CategoryDetailAdapter(val items : List<String>) : RecyclerView.Adapter<CategoryDetailAdapter.ViewHolder>() {
  override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CategoryDetailAdapter.ViewHolder
  {
    return ViewHolder(TextView(p0.context))
  }

  override fun getItemCount(): Int
  {
    return 70
  }

  override fun onBindViewHolder(p0: CategoryDetailAdapter.ViewHolder, p1: Int)
  {
    p0.textView.text = "aaaaa"
  }

  class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}
