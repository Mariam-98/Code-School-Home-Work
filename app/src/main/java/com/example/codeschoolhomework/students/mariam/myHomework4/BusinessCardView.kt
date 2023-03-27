package com.example.codeschoolhomework.students.mariam.myHomework4

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.example.codeschoolhomework.R

class BusinessCardView @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attr, defStyleAttr) {

    private var view: View
    private var busCardImageView: ImageView
    private var titleTextView: TextView
    private var actionBtn: Button

    private var title: String? = null

    private var onActionClickListener: OnClickListener? = null

    init {
        view = LayoutInflater.from(context).inflate(R.layout.view_business_card, this, false)

        busCardImageView = view.findViewById(R.id.businessCardImageView)
        titleTextView = view.findViewById(R.id.TitleTextView)
        actionBtn = view.findViewById(R.id.ActionButton)

        context.theme.obtainStyledAttributes(attr, R.styleable.BusinessCardView, 0, 0)
            .apply {
                val title = this.getString(R.styleable.BusinessCardView_title) ?: TITLE_DEFAULT
                val actionTitle = this.getString(R.styleable.BusinessCardView_actionBtnTitle) ?: ACTION_TITLE_DEFAULT
                val titleStyle = BusinessCardViewTextStyleEnum.from(this.getInteger(R.styleable.BusinessCardView_titleStyle, 2)) ?: BusinessCardViewTextStyleEnum.NORMAL
                setTitle(title)
                setActionBtnText(actionTitle)
                setTitleTextStyle(titleStyle)

                setTitleTextSize(this.getDimension(R.styleable.BusinessCardView_titleSize, 16f))

                setActionBtnColor(
                    this.getColor(
                        R.styleable.BusinessCardView_actionBtnColor, ContextCompat.getColor(context, R.color.bc_orange)
                    )
                )
            }
            .also {
                it.recycle()
            }


        actionBtn.setOnClickListener { view ->
            Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show()
            onActionClickListener?.let {
                it.onClick(view)
            }
        }

        addView(view)
    }

    fun setTitle(title: String) {
        this.title = title
        titleTextView.text = title
    }

    fun setTitleTextStyle(enum: BusinessCardViewTextStyleEnum) {
        titleTextView.typeface = when (enum.value) {
            0 -> Typeface.DEFAULT_BOLD
            1 -> Typeface.SERIF
            else -> Typeface.DEFAULT
        }
    }

    fun setActionBtnColor(color: Int) {
        actionBtn.setBackgroundColor(color)
    }

    fun setActionBtnText(text: String) {
        actionBtn.text = text
    }

    fun setTitleTextSize(size: Float) {
        titleTextView.textSize = size

    }

    fun setOnActionClickListener(onActionClickListener: OnClickListener) {
        this.onActionClickListener = onActionClickListener
    }

    companion object {
        private const val TITLE_DEFAULT = "Title"
        private const val ACTION_TITLE_DEFAULT = "Action btn"
    }
}