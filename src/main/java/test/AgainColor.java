package test;

public enum AgainColor {
	RED("红色"),GREEN("绿色"),BLANK("白色"),YELLO("黄色");
	
	  // 定义私有变量
    private String nCode;

    // 构造函数，枚举类型只能为私有
    private AgainColor(String _nCode) {
        this.nCode = _nCode;
    }

    @Override
    public String toString() {

        return String.valueOf(this.nCode);

    }
}
