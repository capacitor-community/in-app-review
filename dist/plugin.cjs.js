'use strict';

var core = require('@capacitor/core');

const RateApp = core.registerPlugin('RateApp', {
    web: () => Promise.resolve().then(function () { return web; }).then(m => new m.RateAppWeb()),
});

class RateAppWeb extends core.WebPlugin {
    async requestReview() {
        return;
    }
}

var web = /*#__PURE__*/Object.freeze({
    __proto__: null,
    RateAppWeb: RateAppWeb
});

exports.RateApp = RateApp;
//# sourceMappingURL=plugin.cjs.js.map
