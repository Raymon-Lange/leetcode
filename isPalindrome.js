/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    
    let result = s.replace(/[`\s~!@#$%^&*()_|+\-=?;:'",.<>\{\}\[\]\\\/]/gi, '').toLowerCase();

    let copy = result.split("").reverse().join("");
    
    return result === copy;    
};
