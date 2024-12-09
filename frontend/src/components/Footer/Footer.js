import React, { Component } from 'react'
import './Footer.css'
import { VscHome, VscMenu, VscHeart, VscArchive, VscChevronUp } from 'react-icons/vsc'
import { Carousel } from 'antd'
import PopupSearch from '../PopupSearch/PopupSearch'
import BoardContainer from '../Board/BoardContainer'
//import Copyright from '../Copyright/Copyright'

export default class Footer extends Component {

  // scrollToTop 메서드를 static으로 정의
  static scrollToTop = () => {
    window.scrollTo({
      top: 0,
      behavior: 'smooth' // 스크롤을 부드럽게 이동
    })
  }

  render() {
    return (
      <div className='footer'>
        {/* TopMenu */}
        <div className='topMenu'>
          <VscMenu />
          <span className='logo'>PUBLIC</span>
          <PopupSearch />
        </div>
        {/* Antd Carousel 캐러셀 */}
        <Carousel autoplay> {/* autoplay 속성 추가 */}
          <div className='contentStyle'>
            <img src={process.env.PUBLIC_URL + '/img/1.png'} alt="자원봉사" className="carouselImage"/>
          </div>
          <div className='contentStyle'>
            <img src={process.env.PUBLIC_URL + '/img/2.png'} alt="자원봉사" className="carouselImage"/>
          </div>
          <div className='contentStyle'>
            <img src={process.env.PUBLIC_URL + '/img/3.png'} alt="자원봉사" className="carouselImage"/>
          </div>
          <div className='contentStyle'>
            <img src={process.env.PUBLIC_URL + '/img/4.png'} alt="자원봉사" className="carouselImage"/>
          </div>
        </Carousel>

        {/* Contents */}

        <div className='boardList'>
        Know clearly the purpose of volunteering and have a posture to look back on the purity of the first time.
        I try to have a character that can set an example to others with positive thoughts in everything.
        Take care of others and faithfully fulfill your duties.
        Always think about how your words or actions affect you and act in a careful manner.
        Start volunteer activities with a sense of responsibility for the activities.
        We do our activities sincerely, and we keep our promises on the time of our activities.
        Even if you have your own personal problems or feelings, you must have the ability and qualities to separate them from your work.
        Volunteers should be conscientious.
        Volunteers should be constantly studying and learning.
        </div>

        <hr />

        <BoardContainer />

        {/* <Copyright /> */}

        {/* 하단 네비게이션 바 */}
        <nav className='nav'>
          <ul className='navBar'>
            <li><VscHome />HOME</li>  
            <li><VscMenu />CATEGORY</li>  
            <li><VscHeart />MYPAGE</li>  
            <li><VscArchive />CART</li>  
             {/* scrollToTop을 호출할 때 this를 통해 접근 */}
            <li onClick={Footer.scrollToTop} style={{ cursor: 'pointer' }}><VscChevronUp />TOP</li>
          </ul>   
        </nav>
      </div>
    )
  }
}
