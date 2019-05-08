package com.pt.sp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.pt.sp.dto.StockCatagaryDTO;
@Service("StockService")
public class StockMarketServiceImpl implements StockMarketService {

	@Override
	public List<StockCatagaryDTO> SendStockCatagory() {
		Random random=null;
		List<StockCatagaryDTO> stockcatagorylist=null;
		StockCatagaryDTO dto1,dto2,dto3,dto4;
		stockcatagorylist=new ArrayList<>();
		//creatng random integer
		random=new Random();
		//creating 1st stockname
		dto1=new StockCatagaryDTO();
			dto1.setName("SENSEX");
			dto1.setValue(1000*32*random.nextFloat());
			stockcatagorylist.add(dto1);
			//creating 2nd stockname
			dto2=new StockCatagaryDTO();
				dto2.setName("NIFTY");
				dto2.setValue(120*453*random.nextFloat());
				stockcatagorylist.add(dto2);
				//creating 3rd stockname
				dto3=new StockCatagaryDTO();
					dto3.setName("BANKNIFTY");
					dto3.setValue(1100*211*random.nextFloat());
					stockcatagorylist.add(dto3);
					//creating 4th stockname
					dto4=new StockCatagaryDTO();
						dto4.setName("USD/FIR");
						dto4.setValue(2311*211*random.nextFloat());
						stockcatagorylist.add(dto4);
		return stockcatagorylist;
	
	}

}
