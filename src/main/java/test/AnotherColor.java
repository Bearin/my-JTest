package test;

public enum AnotherColor {
	RED( 1), GREEN( 2), BLANK( 3), YELLO( 4);
	
	  // 定义私有变量
    private int nCode;

    // 构造函数，枚举类型只能为私有
    private AnotherColor(int _nCode) {
        this.nCode = _nCode;
    }

    @Override
    public String toString() {

        return String.valueOf(this.nCode);

    }
	
}
