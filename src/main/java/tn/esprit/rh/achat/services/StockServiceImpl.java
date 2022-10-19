package tn.esprit.rh.achat.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.rh.achat.entities.Stock;
import tn.esprit.rh.achat.repositories.StockRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class StockServiceImpl implements IStockService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> retrieveAllStocks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock addStock(Stock s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStock(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Stock updateStock(Stock u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock retrieveStock(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String retrieveStatusStock() {
		// TODO Auto-generated method stub
		return null;
	}



}