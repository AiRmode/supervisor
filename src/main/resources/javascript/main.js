import React from 'react';
import ReactDOM from 'react-dom';
import '@atlaskit/css-reset';
import '@atlaskit/reduced-ui-pack';
import Dashboard from './components/Dashboard/Dashboard.js'

function startRender() {
    ReactDOM.render(
        <Dashboard/>,
        document.getElementById('react-container'));
}

window.onload = startRender;