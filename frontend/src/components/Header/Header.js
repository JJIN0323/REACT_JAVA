import React, { Component } from 'react'
import './Header.css'
import Field from '../Field/Field'
import RecommendKeyword from '../RecommendKeyword/RecommendKeyword'


export default class Header extends Component {
  render() {
    return (
      <div className='header'>
        <span className='headerTtitle'>PUBLIC</span>
        <Field />
        <RecommendKeyword />
      </div>
    )
  }
}
