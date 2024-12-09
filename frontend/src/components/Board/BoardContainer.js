import React, { Component } from 'react'
import Board from '../Board/Board'

export default class 
 extends Component {
  render() {
    return (
      <div className="board">
      <h2 className="boardTitle">volunteer work</h2>
        <Board />
        <Board />
        <Board />
        <Board />
      </div>
    )
  }
}
