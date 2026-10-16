package com.kh.run;

import com.kh.condition.*;
import com.kh.loop.*;

public class Run {

	public static void main(String[] args) {
		ConditionIf cI = new ConditionIf();
		ConditionElse ce = new ConditionElse();
		ConditionSwitch cSwitch = new ConditionSwitch();
		
		LoopFor lFor = new LoopFor();
		LoopWhile lWhile = new LoopWhile();
		lWhile.generateLottoNumber();
	}

}
