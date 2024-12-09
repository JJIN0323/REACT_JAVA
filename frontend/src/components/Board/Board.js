import React from 'react'
import './Board.css'

const Board = () => {
  const reviews = [
    { text: "봉사활동 후기 입니다.", imageCount: 1 },
    { text: "자원봉사의 의미가 있네요~", imageCount: 1 }
  ];

  return (    
      <div className="reviewList">
        {reviews.map((review, index) => (
          <div key={index} className="reviewCard">
            <div className="reviewImage">
              {Array.from({ length: review.imageCount }).map((_, imgIndex) => (
                <div key={imgIndex} className="thumbnail" />
              ))}
            </div>
            <p className="reviewText">{review.text}</p>
          </div>
        ))}
      </div>
  )
}

export default Board;
