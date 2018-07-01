import React, {Component} from 'react'
import Button from '@atlaskit/button';
import '@atlaskit/css-reset';
import '@atlaskit/reduced-ui-pack';
import {getSearchResults} from '../../api/testController'

class Dashbord extends Component {
    constructor(props) {
        super(props);

        this.handleClick = this.handleClick.bind(this);
    }

    handleClick() {
        const token = $('meta[name="token"]').attr("content");

        //just for tests
        getSearchResults("TP-1", token)
            .then(function(response) {
                return response.json();
            })
            .then(function(data) {
                console.log(data);
            })
            .catch( alert );
    }

    render() {
        return (
            <div className="ak-button">
                <Button onClick={this.handleClick}>
                    Button uses React and Atlaskit
                </Button>
            </div>
        );
    }
}

export default Dashbord;