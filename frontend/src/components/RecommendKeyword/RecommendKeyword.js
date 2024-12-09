import React from 'react'
import './RecommendKeyword.css'

const RecommendKeyword = () => {
    const keywords = ["봉사1", "봉사2", "봉사3", "봉사4", "봉사5"]

    return (
        <div className="recommendKeywordWrap">
            <h3 className="title"># KEYWORD</h3>
            <ul className="recommendKeywordList">
                {keywords.map((keyword, index) => (
                    <li className="recommendKeywordItem" key={index}>
                        <a className="keywordLink" href="#">{keyword}</a>
                    </li>
                ))}
            </ul>
        </div>
    )
}

export default RecommendKeyword
