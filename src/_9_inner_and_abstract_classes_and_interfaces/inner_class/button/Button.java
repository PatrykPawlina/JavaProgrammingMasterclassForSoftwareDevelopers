package _9_inner_and_abstract_classes_and_interfaces.inner_class.button;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        void onClick(String title);
    }
}

