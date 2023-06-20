package es.labturing.utils.models;

public class Interval {

	private double min;
	private double max;

	public Interval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public Interval() {
		this(0, 0);
	}

	public Interval(Interval interval) {
		this(interval.min, interval.max);
	}

	public Interval(String string) {
		int hours = Integer.parseInt(string.substring(
				0, string.indexOf(":")).trim());

		int minutes = Integer.parseInt(string.substring(string.indexOf(":") + 1,
				string.indexOf("-")).trim());
		min = hours + minutes / 60.0;

		hours = Integer.parseInt(
				string.substring(string.indexOf("-") + 1, string.indexOf(":")).trim());
		minutes = Integer.parseInt(
				string.substring(string.indexOf(":") + 1).trim());
		max = hours + minutes / 60.0;
	}

	public String toString() {
		return "[" + this.min + ", " + this.max + "]";
	}

	public double length() {
		return max - min;
	}

	public double middlePoint() {
		return (max + min) / 2;
	}

	public Interval copy() {
		return new Interval(this);
	}

	public Interval symetric() {
		return new Interval(-max, -min);
	}

	public void shift(double cantidad) {
		min += cantidad;
		max += cantidad;
	}

	public void escale(double escala) {
		double nuevaLongitud = this.length() * escala;
		double puntoMedio = this.middlePoint();
		min = puntoMedio - nuevaLongitud / 2;
		max = puntoMedio + nuevaLongitud / 2;
	}

	public boolean includes(double punto) {
		return min <= punto && punto <= max;
	}

	public boolean includes(Interval intervalo) {
		return this.includes(intervalo.min)
				&& this.includes(intervalo.max);
	}

	public boolean equals(Interval intervalo) {
		return min == intervalo.min
				&& max == intervalo.max;
	}

	public Interval intersection(Interval intervalo) {
		if (this.includes(intervalo)) {
			return intervalo.copy();
		} else if (intervalo.includes(this)) {
			return this.copy();
		} else if (this.includes(intervalo.min)) {
			return new Interval(intervalo.min, this.max);
		} else if (this.includes(intervalo.max)) {
			return new Interval(this.min, intervalo.max);
		} else {
			return null;
		}
	}

	public Interval shifted(double cantidad) {
		Interval intervalo = this.copy();
		intervalo.shift(cantidad);
		return intervalo;
	}

}
