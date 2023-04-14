package kr.ac.kopo.ui;

public class ExitUI implements IBoardUI{
	
	@Override
	public void execute() throws Exception {
		System.out.println("종료~");
		System.exit(0);
	}

}
