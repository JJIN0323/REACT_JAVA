import React from 'react'
import './Field.css'
import { VscSearch } from 'react-icons/vsc'

const Field = () => {
  return (
    <fieldset className="fieldContainer">
      <legend>검색</legend>
      <input className="inputTypeText" id="keywordSearch" name="keyword" placeholder="Volunteer work are you looking for?" type="text" />
      <VscSearch className='searchBtn'/>
    </fieldset>
  )
}

export default Field
