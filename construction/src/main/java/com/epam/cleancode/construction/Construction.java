package com.epam.cleancode.construction;


public class Construction {
	int cost;
float construct(int flag,float area){
	
	switch(flag){
	case 1:this.cost=1200;
			break;
	case 2:this.cost=1500;
			break;
	case 3:this.cost=1800;
			break;
	case 4:this.cost=2500;
			break;
	
	}
	return this.cost*area;
	
	
}


}
