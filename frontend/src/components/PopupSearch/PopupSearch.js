import React, { useState } from 'react'
import './PopupSearch.css'
import { VscSearch, VscMenu } from 'react-icons/vsc'
import Field from '../Field/Field'
import RecommendKeyword from '../RecommendKeyword/RecommendKeyword'

const PopupButton = () => {
  const [isPopupVisible, setPopupVisible] = useState(false);

  const togglePopup = () => setPopupVisible(!isPopupVisible);

  return (
    <div>
      {/* Search/Popup Button */}
      <div 
        className={`searcBtn ${isPopupVisible ? 'selected' : ''}`} 
        onClick={togglePopup}
      >
        {isPopupVisible ? <VscSearch size={24} data-type="off" /> : <VscSearch size={24} data-type="on" />}
      </div>

      {/* Menu Overlay */}
      {isPopupVisible && (
        <div className="menuOverlay" onClick={togglePopup}>
          <div className="overlayContent">
            <Field />
            <RecommendKeyword />
          </div>
        </div>
      )}
    </div>
  );
};

export default PopupButton;
