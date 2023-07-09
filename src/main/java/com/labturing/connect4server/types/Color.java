package com.labturing.connect4server.types;

public enum Color {

    RED,
    YELLOW,
    NULL;

    private Color() {

    }

    public static Color get(int ordinal) {
        assert(0 <= ordinal && ordinal < Color.NULL.ordinal());
        return Color.values()[ordinal];
    }

    public Color getOpposite() {
        return Color.values()[this.ordinal() + 1 % (Color.values().length - 1)];//TODO LE HE PUESTO + 1 ...funcionaba antes?
    }

    public boolean isNull(){
        return this == Color.NULL;
    }

}
