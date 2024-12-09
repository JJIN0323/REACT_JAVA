import React from 'react';

function HelloMessage({ message }) {
  return (
    <div>
      <h2>{message ? message : "Loading..."}</h2>
    </div>
  );
}

export default HelloMessage;
