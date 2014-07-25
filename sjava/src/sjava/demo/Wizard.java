package sjava.demo;

public class Wizard {
	private String name;
	private int hp;
	private int mp;
	private Wand wand;

	public void heal(Hero h){
		int basepoint = 10; //基本回復ポイント
		int recovpoint = (int)(basepoint*this.getWand().getPower());//杖による増幅
		h.setHp(h.getHp() + recovpoint);
		System.out.println(h.getName() + "のHPを" + recovpoint + "回復した！");
	}

	public Wand getWand(){
		return wand;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name==null||name.length()<3){
			throw new IllegalArgumentException("名前が異常です！中断！");
		}
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if(hp<0){
			this.hp =0;
		}else{
		this.hp = hp;
		}
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if(mp<0){
			throw new IllegalArgumentException("MPが異常です！中断！");
		}
		this.mp = mp;
	}

	public void setWand(Wand wand){
		if(wand==null){
			throw new IllegalArgumentException("杖が異常です！中断！");
		}
		this.wand = wand;
	}
}
