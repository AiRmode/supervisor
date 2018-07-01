import URL from './root'

export function getSearchResults(query, token) {
    let options = {
            method: 'GET'
        },
        url = URL + "getIssue/" + query + "?jwt=" + token;
    console.log(url);
    return fetch(url, options);
}