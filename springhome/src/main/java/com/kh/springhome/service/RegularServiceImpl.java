package com.kh.springhome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.kh.springhome.dao.CertDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RegularServiceImpl implements RegularService {

	@Autowired
	private CertDao certDao;
	
	//스케줄러 메소드는 언제 실행할 것인지에 대한 설정이 추가로 필요( * : all / ? : any )
	//@Scheduled(fixedRate = 1000)//100ms(1초)에 한 번씩 실행
	//@Scheduled(cron = "* * * * * *")//매초 매분 매시 매일 매월 매요일
	//@Scheduled(cron = "*/2 * * * * *")//매2초 매분 매시 매일 매월 매요일
	//@Scheduled(cron = "0 * * * * *")//0초 매분 매시 매일 매월 매요일(1분마다)
	@Scheduled(cron = "0 0 * * * *")//매 시 정각마다
	//@Scheduled(cron = "0 30 * * * *")//매 시 30분마다
	//@Scheduled(cron = "0 0 9 * * *")//매일 아침 9시
	//@Scheduled(cron = "0 30 9,18 * * *")//출근할 때(9:30) 한 번, 퇴근할 때 한 번(18:30)
	//@Scheduled(cron = "0 30 9-18 * * *")//출근할 때(9:30)부터 퇴근할 때(18:30)까지 1시간마다
	//@Scheduled(cron = "0 30 9-18 * * 1-5")//월요일부터 금요일, 출근할 때(9:30)부터 퇴근할 때(18:30)까지 1시간마다
	//@Scheduled(cron = "0 30 9-18 * * mon-fri")//월요일부터 금요일, 출근할 때(9:30)부터 퇴근할 때(18:30)까지 1시간마다
	//@Scheduled(cron = "* * * * * 1")//월요일만 1초마다
	//@Scheduled(cron = "* * * * * mon")//월요일만 1초마다
	//@Scheduled(cron = "* * * 18 * ?")//요일 무관 18일마다
	//@Scheduled(cron = "0 0 12 ? * 4L")//매월 마지막(L) 목요일 12시 정각
	//@Scheduled(cron = "0 0 12 ? * thuL")//매월 마지막(L) 목요일 12시 정각
	//@Scheduled(cron = "0 0 12 ? * 4#1")//매월 1주차 목요일 12시 정각
	//@Scheduled(cron = "0 0 12 ? * thu#1")//매월 1주차 목요일 12시 정각
	@Override
	public void clearCert() {
		//log.debug("실행됨?");
		certDao.deleteOver5min();
	}

}
